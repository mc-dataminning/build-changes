import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class cxa extends cuj implements dca {
   protected static final MapCodec<List<dca.a>> a = dca.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<cxa> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cxa::b), t()).apply($$0, cxa::new));
   protected static final float c = 3.0F;
   protected static final eiy d = cua.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dca.a> e;

   @Override
   public MapCodec<? extends cxa> a() {
      return b;
   }

   public cxa(bje $$0, int $$1, dga.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public cxa(List<dca.a> $$0, dga.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dca.a> a(bje $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new dca.a($$0, $$2));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      eif $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dca.a> b() {
      return this.e;
   }
}
