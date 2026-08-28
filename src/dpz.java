import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpz extends dgv {
   public static final MapCodec<dpz> a = b(dpz::new);
   public static final dvm<dtu> b = dve.by;
   public static final dvf c = dve.bA;

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   public dpz(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dtu.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new dto($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0 instanceof arh $$3
         ? a($$2, dru.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dve.bA).orElse(false)))
         : a($$2, dru.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dve.bA).orElse(false)));
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfa.a($$0, $$2, "spawn_data");
   }
}
