import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adt {
   private static final int a = 2097152;
   private final us b;
   private final byte[] c;
   private final List<adt.a> d;

   public adt(dui $$0) {
      this.b = new us();

      for (Entry<dxu.a, dxu> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uz($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new wm(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<iz, dph> $$2 : $$0.G().entrySet()) {
         this.d.add(adt.a.a($$2.getValue()));
      }
   }

   public adt(xa $$0, int $$1, int $$2) {
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
            this.d = adt.a.b.decode($$0);
         }
      }
   }

   public void a(xa $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adt.a.b.encode($$0, this.d);
   }

   private static int a(dui $$0) {
      int $$1 = 0;

      for (duj $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(wm $$0, dui $$1) {
      for (duj $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adt.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adt.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iz.a $$5 = new iz.a();

      for (adt.a $$6 : this.d) {
         int $$7 = $$3 + kb.b($$6.c >> 4);
         int $$8 = $$4 + kb.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public wm a() {
      return new wm(Unpooled.wrappedBuffer(this.c));
   }

   public us b() {
      return this.b;
   }

   static class a {
      public static final zn<xa, adt.a> a = zn.a(adt.a::a, adt.a::new);
      public static final zn<xa, List<adt.a>> b = a.a(zl.a());
      final int c;
      final int d;
      final dpj<?> e;
      @Nullable
      final us f;

      private a(int $$0, int $$1, dpj<?> $$2, @Nullable us $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(xa $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = zl.a(lq.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(xa $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         zl.a(lq.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adt.a a(dph $$0) {
         us $$1 = $$0.a($$0.i().H_());
         iz $$2 = $$0.ay_();
         int $$3 = kb.b($$2.u()) << 4 | kb.b($$2.w());
         return new adt.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iz var1, dpj<?> var2, @Nullable us var3);
   }
}
