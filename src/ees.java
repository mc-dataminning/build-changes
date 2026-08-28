import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class ees implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<eer> c = new Long2ObjectLinkedOpenHashMap();
   private final eeu d;
   private final Path e;
   private final boolean f;

   ees(eeu $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private eer b(djc $$0) throws IOException {
      long $$1 = djc.c($$0.h(), $$0.i());
      eer $$2 = (eer)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((eer)this.c.removeLast()).close();
         }

         w.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         eer $$4 = new eer(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public tz a(djc $$0) throws IOException {
      eer $$1 = this.b($$0);

      tz var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = um.a($$2);
      }

      return var4;
   }

   public void a(djc $$0, uv $$1) throws IOException {
      eer $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            um.a((DataInput)$$3, $$1, ui.a());
         }
      }
   }

   protected void a(djc $$0, @Nullable tz $$1) throws IOException {
      eer $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            um.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayv<IOException> $$0 = new ayv<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         eer $$1 = (eer)var2.next();

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
         eer $$0 = (eer)var1.next();
         $$0.b();
      }
   }

   public eeu b() {
      return this.d;
   }
}
