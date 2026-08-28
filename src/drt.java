import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drt extends drs {
   public static final MapCodec<drt> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mh.e.q().fieldOf("host").forGetter(drs::b), t()).apply($$0, drt::new));

   @Override
   public MapCodec<drt> a() {
      return b;
   }

   public drt(dno $$0, ebp.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(duh.d, jc.a.b));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return duh.b($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(duh.d);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(duh.d, $$0.k().o());
   }
}
