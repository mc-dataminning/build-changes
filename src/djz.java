import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class djz implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<djy> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   djz(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private djy b(cqz $$0) throws IOException {
      long $$1 = cqz.c($$0.h(), $$0.i());
      djy $$2 = (djy)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((djy)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         djy $$4 = new djy($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public rz a(cqz $$0) throws IOException {
      djy $$1 = this.b($$0);

      rz var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = sm.a($$2);
      }

      return var4;
   }

   public void a(cqz $$0, st $$1) throws IOException {
      djy $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            sm.a((DataInput)$$3, $$1, si.a());
         }
      }
   }

   protected void a(cqz $$0, @Nullable rz $$1) throws IOException {
      djy $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            sm.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      asp<IOException> $$0 = new asp<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         djy $$1 = (djy)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         djy $$0 = (djy)var1.next();
         $$0.a();
      }
   }
}
