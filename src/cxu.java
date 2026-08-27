import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class cxu extends cvc implements dcu {
   protected static final MapCodec<List<dcu.a>> a = dcu.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<cxu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cxu::b), t()).apply($$0, cxu::new));
   protected static final float c = 3.0F;
   protected static final ekb d = cut.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dcu.a> e;

   @Override
   public MapCodec<? extends cxu> a() {
      return b;
   }

   public cxu(bjt $$0, int $$1, dgv.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public cxu(List<dcu.a> $$0, dgv.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dcu.a> a(bjt $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new dcu.a($$0, $$2));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      eji $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dcu.a> b() {
      return this.e;
   }
}
