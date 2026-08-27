import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class acj {
   private static final int a = 2097152;
   private final tm b;
   private final byte[] c;
   private final List<acj.a> d;

   public acj(drf $$0) {
      this.b = new tm();

      for (Entry<dur.a, dur> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new tt($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vg(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<ib, dmf> $$2 : $$0.G().entrySet()) {
         this.d.add(acj.a.a($$2.getValue()));
      }
   }

   public acj(vr $$0, int $$1, int $$2) {
      this.b = $$0.o();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.l();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = acj.a.b.decode($$0);
         }
      }
   }

   public void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      acj.a.b.encode($$0, this.d);
   }

   private static int a(drf $$0) {
      int $$1 = 0;

      for (drg $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vg $$0, drf $$1) {
      for (drg $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<acj.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(acj.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      ib.a $$5 = new ib.a();

      for (acj.a $$6 : this.d) {
         int $$7 = $$3 + je.b($$6.c >> 4);
         int $$8 = $$4 + je.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vg a() {
      return new vg(Unpooled.wrappedBuffer(this.c));
   }

   public tm b() {
      return this.b;
   }

   static class a {
      public static final ye<vr, acj.a> a = ye.a(acj.a::a, acj.a::new);
      public static final ye<vr, List<acj.a>> b = a.a(yc.a());
      final int c;
      final int d;
      final dmh<?> e;
      @Nullable
      final tm f;

      private a(int $$0, int $$1, dmh<?> $$2, @Nullable tm $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(vr $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yc.a(ks.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(vr $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         yc.a(ks.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static acj.a a(dmf $$0) {
         tm $$1 = $$0.a($$0.i().H_());
         ib $$2 = $$0.aA_();
         int $$3 = je.b($$2.u()) << 4 | je.b($$2.w());
         return new acj.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(ib var1, dmh<?> var2, @Nullable tm var3);
   }
}
