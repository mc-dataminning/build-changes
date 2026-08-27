import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cug(cug.a d, IntList e, IntList f, boolean g, boolean h) implements cus {
   public static final cug a = new cug(cug.a.a, IntList.of(), IntList.of(), false, false);
   private static final Codec<IntList> i = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cug> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cug.a.g.fieldOf("shape").forGetter(cug::a),
               awu.a(i, "colors", IntList.of()).forGetter(cug::b),
               awu.a(i, "fade_colors", IntList.of()).forGetter(cug::c),
               awu.a(Codec.BOOL, "has_trail", false).forGetter(cug::d),
               awu.a(Codec.BOOL, "has_twinkle", false).forGetter(cug::e)
            )
            .apply($$0, cug::new)
   );
   private static final yg<ByteBuf, IntList> j = ye.e.a(ye.a()).a(IntArrayList::new, ArrayList::new);
   public static final yg<ByteBuf, cug> c = yg.a(cug.a.f, cug::a, j, cug::b, j, cug::c, ye.b, cug::d, ye.b, cug::e, cug::new);
   private static final wi k = wi.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(Consumer<wi> $$0, cti $$1) {
      this.a($$0);
      this.b($$0);
   }

   public void a(Consumer<wi> $$0) {
      $$0.accept(this.d.a().a(n.h));
   }

   public void b(Consumer<wi> $$0) {
      if (!this.e.isEmpty()) {
         $$0.accept(a(wi.i().a(n.h), this.e));
      }

      if (!this.f.isEmpty()) {
         $$0.accept(a(wi.c("item.minecraft.firework_star.fade_to").b(wh.v).a(n.h), this.f));
      }

      if (this.g) {
         $$0.accept(wi.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.h) {
         $$0.accept(wi.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static wi a(ww $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wi a(int $$0) {
      cql $$1 = cql.b($$0);
      return (wi)($$1 == null ? k : wi.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cug a(IntList $$0) {
      return new cug(this.d, this.e, new IntArrayList($$0), this.g, this.h);
   }

   public cug.a a() {
      return this.d;
   }

   public IntList b() {
      return this.e;
   }

   public IntList c() {
      return this.f;
   }

   public boolean d() {
      return this.g;
   }

   public boolean e() {
      return this.h;
   }

   public static enum a implements ayg {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cug.a> h = awd.a(cug.a::b, values(), awd.a.a);
      public static final yg<ByteBuf, cug.a> f = ye.a(h, cug.a::b);
      public static final Codec<cug.a> g = ayg.b(cug.a::values);
      private final int i;
      private final String j;

      private a(int $$0, String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public ww a() {
         return wi.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cug.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
