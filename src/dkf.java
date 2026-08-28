import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkf extends diq {
   public static final MapCodec<diq> a = lz.e.q().fieldOf("dead");
   public static final MapCodec<dkf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dkf::new));
   private final diq c;

   public dkf(diq $$0, dvu.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dkf> a() {
      return b;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(der $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         erv $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axi.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().G_().a(40));
      }

      return this.m();
   }
}
