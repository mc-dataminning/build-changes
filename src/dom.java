import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dom extends dgf {
   public static final MapCodec<dom> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dom.a.b.fieldOf("kind").forGetter(dgf::b), u()).apply($$0, dom::new));
   public static final int d = dvu.a();
   private static final int b = d + 1;
   public static final dvo e = dve.ba;
   protected static final ezm f = dhj.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ezm g = dhj.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dom> a() {
      return c;
   }

   protected dom(dom.a $$0, dun.d $$1) {
      super($$0, $$1);
      this.l(this.o().b(e, Integer.valueOf(0)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.b() == dom.b.h ? g : f;
   }

   @Override
   protected ezm d_(duo $$0) {
      return ezj.a();
   }

   @Override
   public duo a(czk $$0) {
      return super.a($$0).b(e, Integer.valueOf(dvu.a($$0.i())));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.b(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends azz {
      Map<String, dom.a> a = new Object2ObjectArrayMap();
      Codec<dom.a> b = Codec.stringResolver(azz::c, a::get);
   }

   public static enum b implements dom.a {
      c("skeleton"),
      d("wither_skeleton"),
      e("player"),
      f("zombie"),
      g("creeper"),
      h("piglin"),
      i("dragon");

      private final String j;

      private b(final String $$0) {
         this.j = $$0;
         a.put($$0, this);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
