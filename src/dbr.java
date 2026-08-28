import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record dbr(dbr.a e, IntList f, IntList g, boolean h, boolean i) implements dci {
   public static final dbr a = new dbr(dbr.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<dbr> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbr.a.g.fieldOf("shape").forGetter(dbr::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(dbr::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(dbr::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(dbr::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(dbr::e)
            )
            .apply($$0, dbr::new)
   );
   private static final yw<ByteBuf, IntList> j = yu.g.a(yu.a()).a(IntArrayList::new, ArrayList::new);
   public static final yw<ByteBuf, dbr> d = yw.a(dbr.a.f, dbr::a, j, dbr::b, j, dbr::c, yu.b, dbr::d, yu.b, dbr::e, dbr::new);
   private static final wy k = wy.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      $$1.accept(this.e.a().a(n.h));
      this.a($$1);
   }

   public void a(Consumer<wy> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(wy.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(wy.c("item.minecraft.firework_star.fade_to").b(wx.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(wy.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(wy.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static wy a(xm $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wy a(int $$0) {
      cyb $$1 = cyb.b($$0);
      return (wy)($$1 == null ? k : wy.c("item.minecraft.firework_star." + $$1.b()));
   }

   public dbr a(IntList $$0) {
      return new dbr(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public dbr.a a() {
      return this.e;
   }

   public IntList b() {
      return this.f;
   }

   public IntList c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public static enum a implements bak {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<dbr.a> h = ayc.a(dbr.a::b, values(), ayc.a.a);
      public static final yw<ByteBuf, dbr.a> f = yu.a(h, dbr.a::b);
      public static final Codec<dbr.a> g = bak.b(dbr.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xm a() {
         return wy.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static dbr.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
