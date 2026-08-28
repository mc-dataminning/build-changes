import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ado {
   private static final int a = 2097152;
   private final uj b;
   private final byte[] c;
   private final List<ado.a> d;

   public ado(dxj $$0) {
      this.b = new uj();

      for (Entry<eaz.a, eaz> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uq($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new we(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<jg, dsg> $$2 : $$0.F().entrySet()) {
         this.d.add(ado.a.a($$2.getValue()));
      }
   }

   public ado(ws $$0, int $$1, int $$2) {
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
            this.d = ado.a.b.decode($$0);
         }
      }
   }

   public void a(ws $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      ado.a.b.encode($$0, this.d);
   }

   private static int a(dxj $$0) {
      int $$1 = 0;

      for (dxk $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(we $$0, dxj $$1) {
      for (dxk $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<ado.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(ado.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      jg.a $$5 = new jg.a();

      for (ado.a $$6 : this.d) {
         int $$7 = $$3 + ki.b($$6.c >> 4);
         int $$8 = $$4 + ki.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public we a() {
      return new we(Unpooled.wrappedBuffer(this.c));
   }

   public uj b() {
      return this.b;
   }

   static class a {
      public static final zf<ws, ado.a> a = zf.a(ado.a::a, ado.a::new);
      public static final zf<ws, List<ado.a>> b = a.a(zd.a());
      final int c;
      final int d;
      final dsi<?> e;
      @Nullable
      final uj f;

      private a(int $$0, int $$1, dsi<?> $$2, @Nullable uj $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(ws $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = zd.a(ly.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(ws $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         zd.a(ly.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static ado.a a(dsg $$0) {
         uj $$1 = $$0.a($$0.i().H_());
         jg $$2 = $$0.aC_();
         int $$3 = ki.b($$2.u()) << 4 | ki.b($$2.w());
         return new ado.a($$3, $$2.v(), $$0.q(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(jg var1, dsi<?> var2, @Nullable uj var3);
   }
}
