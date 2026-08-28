import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cyl(cyl.a e, IntList f, IntList g, boolean h, boolean i) implements cyz {
   public static final cyl a = new cyl(cyl.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cyl> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyl.a.g.fieldOf("shape").forGetter(cyl::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(cyl::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(cyl::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(cyl::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(cyl::e)
            )
            .apply($$0, cyl::new)
   );
   private static final zc<ByteBuf, IntList> j = za.g.a(za.a()).a(IntArrayList::new, ArrayList::new);
   public static final zc<ByteBuf, cyl> d = zc.a(cyl.a.f, cyl::a, j, cyl::b, j, cyl::c, za.b, cyl::d, za.b, cyl::e, cyl::new);
   private static final xe k = xe.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      this.a($$1);
      this.b($$1);
   }

   public void a(Consumer<xe> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xe> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xe.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xe.c("item.minecraft.firework_star.fade_to").b(xd.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xe.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xe.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xe a(xs $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xe a(int $$0) {
      cum $$1 = cum.b($$0);
      return (xe)($$1 == null ? k : xe.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cyl a(IntList $$0) {
      return new cyl(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cyl.a a() {
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

   public static enum a implements bab {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cyl.a> h = axw.a(cyl.a::b, values(), axw.a.a);
      public static final zc<ByteBuf, cyl.a> f = za.a(h, cyl.a::b);
      public static final Codec<cyl.a> g = bab.b(cyl.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xs a() {
         return xe.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cyl.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
