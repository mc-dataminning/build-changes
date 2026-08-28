import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etg extends esj {
   static final MapCodec<etg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eve.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, etg::new));
   private final evd b;

   private etg(List<euh> $$0, evd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.a();
   }

   @Override
   public esl<etg> b() {
      return esm.Q;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      int $$2 = ayg.a(this.b.a($$1), 0, 4);
      $$0.b(kn.Q, Integer.valueOf($$2));
      return $$0;
   }

   public evd c() {
      return this.b;
   }

   public static esj.a<?> a(evd $$0) {
      return a($$1 -> new etg($$1, $$0));
   }
}
