import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dvm implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dvl> c = new Long2ObjectLinkedOpenHashMap();
   private final dvo d;
   private final Path e;
   private final boolean f;

   dvm(dvo $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dvl b(dbf $$0) throws IOException {
      long $$1 = dbf.c($$0.h(), $$0.i());
      dvl $$2 = (dvl)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dvl)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dvl $$4 = new dvl(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public us a(dbf $$0) throws IOException {
      dvl $$1 = this.b($$0);

      us var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = vf.a($$2);
      }

      return var4;
   }

   public void a(dbf $$0, vm $$1) throws IOException {
      dvl $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            vf.a((DataInput)$$3, $$1, vb.a());
         }
      }
   }

   protected void a(dbf $$0, @Nullable us $$1) throws IOException {
      dvl $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            vf.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayg<IOException> $$0 = new ayg<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dvl $$1 = (dvl)var2.next();

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
         dvl $$0 = (dvl)var1.next();
         $$0.b();
      }
   }
}
