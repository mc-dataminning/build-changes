import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public class dba extends csw {
   public static final MapCodec<dba> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dba.a.b.fieldOf("kind").forGetter(csw::b), t()).apply($$0, dba::new));
   public static final int d = dhh.a();
   private static final int b = d + 1;
   public static final dhb e = dgr.ba;
   protected static final eiy f = cua.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final eiy g = cua.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   @Override
   public MapCodec<? extends dba> a() {
      return c;
   }

   protected dba(dba.a $$0, dga.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(e, Integer.valueOf(0)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.b() == dba.b.h ? g : f;
   }

   @Override
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      return eiv.a();
   }

   @Override
   public dgb a(cmr $$0) {
      return super.a($$0).a(e, Integer.valueOf(dhh.a($$0.i())));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a(e, Integer.valueOf($$1.a($$0.c(e), b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   public interface a extends atr {
      Map<String, dba.a> a = new Object2ObjectArrayMap();
      Codec<dba.a> b = asg.a(atr::c, a::get);
   }

   public static enum b implements dba.a {
      c("skeleton"),
      d("wither_skeleton"),
      e("player"),
      f("zombie"),
      g("creeper"),
      h("piglin"),
      i("dragon");

      private final String j;

      private b(String $$0) {
         this.j = $$0;
         a.put($$0, this);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
