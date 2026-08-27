import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dmk implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dmj> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dmk(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dmj b(csw $$0) throws IOException {
      long $$1 = csw.c($$0.h(), $$0.i());
      dmj $$2 = (dmj)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dmj)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dmj $$4 = new dmj($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public sn a(csw $$0) throws IOException {
      dmj $$1 = this.b($$0);

      sn var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = ta.a($$2);
      }

      return var4;
   }

   public void a(csw $$0, th $$1) throws IOException {
      dmj $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            ta.a((DataInput)$$3, $$1, sw.a());
         }
      }
   }

   protected void a(csw $$0, @Nullable sn $$1) throws IOException {
      dmj $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            ta.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      atv<IOException> $$0 = new atv<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dmj $$1 = (dmj)var2.next();

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
         dmj $$0 = (dmj)var1.next();
         $$0.a();
      }
   }
}
