import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record dcy(dcy.a e, IntList f, IntList g, boolean h, boolean i) implements ddp {
   public static final dcy a = new dcy(dcy.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<dcy> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcy.a.g.fieldOf("shape").forGetter(dcy::a),
               b.optionalFieldOf("colors", IntList.of()).forGetter(dcy::b),
               b.optionalFieldOf("fade_colors", IntList.of()).forGetter(dcy::c),
               Codec.BOOL.optionalFieldOf("has_trail", false).forGetter(dcy::d),
               Codec.BOOL.optionalFieldOf("has_twinkle", false).forGetter(dcy::e)
            )
            .apply($$0, dcy::new)
   );
   private static final ze<ByteBuf, IntList> j = zc.g.a(zc.a()).a(IntArrayList::new, ArrayList::new);
   public static final ze<ByteBuf, dcy> d = ze.a(dcy.a.f, dcy::a, j, dcy::b, j, dcy::c, zc.b, dcy::d, zc.b, dcy::e, dcy::new);
   private static final xg k = xg.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      $$1.accept(this.e.a().a(o.h));
      this.a($$1);
   }

   public void a(Consumer<xg> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xg.i().a(o.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xg.c("item.minecraft.firework_star.fade_to").b(xf.v).a(o.h), this.g));
      }

      if (this.h) {
         $$0.accept(xg.c("item.minecraft.firework_star.trail").a(o.h));
      }

      if (this.i) {
         $$0.accept(xg.c("item.minecraft.firework_star.flicker").a(o.h));
      }
   }

   private static xg a(xu $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xg a(int $$0) {
      czi $$1 = czi.b($$0);
      return (xg)($$1 == null ? k : xg.c("item.minecraft.firework_star." + $$1.b()));
   }

   public dcy a(IntList $$0) {
      return new dcy(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public dcy.a a() {
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

   public static enum a implements bax {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<dcy.a> h = ayo.a(dcy.a::b, values(), ayo.a.a);
      public static final ze<ByteBuf, dcy.a> f = zc.a(h, dcy.a::b);
      public static final Codec<dcy.a> g = bax.b(dcy.a::values);
      private final int i;
      private final String j;

      private a(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xu a() {
         return xg.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static dcy.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
