import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dql extends dne {
   public static final MapCodec<dql> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dql::new)
   );
   private static final Map<dne, dne> b = Maps.newHashMap();
   private static final fgm c = dne.b(6.0, 0.0, 6.0);
   private final dne d;

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(dne $$0, ebf.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      ebg $$8 = ($$0.h() instanceof cyi $$7 ? b.getOrDefault($$7.c(), dng.a) : dng.a).m();
      if ($$8.l()) {
         return but.f;
      } else if (!this.q()) {
         return but.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, egg.c, $$3);
         $$4.a(axb.ah);
         $$0.a(1, $$4);
         return but.a;
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (this.q()) {
         return but.c;
      } else {
         daa $$5 = new daa(this.d);
         if (!$$3.h($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dng.gq.m(), 3);
         $$1.a($$3, egg.c, $$2);
         return but.a;
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new daa(this.d);
   }

   private boolean q() {
      return this.d == dng.a;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dne b() {
      return this.d;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.a(dng.uj) || $$0.a(dng.uk);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (this.f($$0) && $$1.F_().j()) {
         boolean $$4 = this.d == dng.uh;
         boolean $$5 = dpa.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dpz.a $$6 = dpz.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), aws.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public ebg o(ebg $$0) {
      if ($$0.a(dng.uj)) {
         return dng.uk.m();
      } else {
         return $$0.a(dng.uk) ? dng.uj.m() : $$0;
      }
   }
}
