import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class czs extends cwz implements der {
   protected static final MapCodec<List<der.a>> a = der.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<czs> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czs::b), u()).apply($$0, czs::new));
   protected static final float c = 3.0F;
   protected static final emm d = cwq.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<der.a> e;

   @Override
   public MapCodec<? extends czs> a() {
      return b;
   }

   public czs(blg $$0, int $$1, djg.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public czs(List<der.a> $$0, djg.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<der.a> a(blg $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new der.a($$0, $$2));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      elt $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<der.a> b() {
      return this.e;
   }
}
