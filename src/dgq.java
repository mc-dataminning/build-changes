import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgq extends dej {
   public static final MapCodec<dgq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgn.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dgq::new));
   private final dey f;

   @Override
   public MapCodec<dgq> a() {
      return e;
   }

   protected dgq(dey $$0, dsa.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      this.a($$0, (dby)$$1, $$2);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dfa.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, env.c, env.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
