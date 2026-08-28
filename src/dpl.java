import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpl extends dgh {
   public static final MapCodec<dpl> a = b(dpl::new);
   public static final duy<dtg> b = duq.by;
   public static final dur c = duq.bA;

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   public dpl(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, dtg.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dta($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0 instanceof arg $$3
         ? a($$2, drg.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(duq.bA).orElse(false)))
         : a($$2, drg.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(duq.bA).orElse(false)));
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      dem.a($$0, $$2, "spawn_data");
   }
}
