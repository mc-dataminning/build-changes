import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class czl extends cws implements dek {
   protected static final MapCodec<List<dek.a>> a = dek.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<czl> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czl::b), u()).apply($$0, czl::new));
   protected static final float c = 3.0F;
   protected static final emf d = cwj.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<dek.a> e;

   @Override
   public MapCodec<? extends czl> a() {
      return b;
   }

   public czl(bla $$0, int $$1, diz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public czl(List<dek.a> $$0, diz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<dek.a> a(bla $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new dek.a($$0, $$2));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      elm $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<dek.a> b() {
      return this.e;
   }
}
