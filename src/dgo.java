import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgo extends deg {
   public static final MapCodec<dgo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgn.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgo::new));
   private final dey c;

   @Override
   public MapCodec<dgo> a() {
      return b;
   }

   protected dgo(dey $$0, dsa.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      this.a($$0, (dby)$$1, $$2);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfa.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, env.c, env.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
