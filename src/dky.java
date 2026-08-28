import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dky extends dmj {
   public static final MapCodec<dky> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dky::new)
   );
   private final djm b;

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(djm $$0, dww.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, dwx $$3, cla $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dwx a(dag $$0) {
      dfn $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwx $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dfn $$0, ji $$1, dwx $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dfn $$0, ji $$1) {
      boolean $$2 = false;
      ji.a $$3 = $$1.k();

      for (jn $$4 : jn.values()) {
         dwx $$5 = $$0.a_($$3);
         if ($$4 != jn.a || o($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (o($$5) && !$$5.c($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean o(dwx $$0) {
      return $$0.y().a(awv.a);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
