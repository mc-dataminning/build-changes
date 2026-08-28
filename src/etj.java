import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etj extends esj {
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxk.d.fieldOf("pages").forGetter($$0x -> $$0x.b), esi.a(100).forGetter($$0x -> $$0x.c))).apply($$0, etj::new)
   );
   private final List<ard<String>> b;
   private final esi c;

   protected etj(List<euh> $$0, List<ard<String>> $$1, esi $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cud a(cud $$0, eqw $$1) {
      $$0.a(kn.I, cxk.a, this::a);
      return $$0;
   }

   public cxk a(cxk $$0) {
      List<ard<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public esl<etj> b() {
      return esm.O;
   }
}
