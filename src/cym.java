import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class cym extends cua implements daz {
   public static final MapCodec<cym> a = b(cym::new);
   public static final int b = 15;
   public static final dhb c = dgr.aP;
   public static final dgs d = dgr.C;
   public static final ToIntFunction<dgb> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<cym> a() {
      return a;
   }

   public cym(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return bib.a;
      } else {
         return bib.b;
      }
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return $$3.a(ckm.hg) ? eiv.b() : eiv.a();
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return true;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.a;
   }

   @Override
   public float b(dgb $$0, cqf $$1, ht $$2) {
      return 1.0F;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(d) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static ckj a(ckj $$0, int $$1) {
      if ($$1 != 15) {
         rt $$2 = new rt();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
