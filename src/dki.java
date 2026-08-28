import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dki extends dib {
   public static final MapCodec<dki> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkf.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dki::new));
   private final diq f;

   @Override
   public MapCodec<dki> a() {
      return e;
   }

   protected dki(diq $$0, dvu.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return dis.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, erw.c, erw.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
