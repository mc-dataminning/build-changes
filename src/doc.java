import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class doc extends djq {
   public static final MapCodec<doc> a = b(doc::new);
   public static final dyo<jn> b = dyg.S;
   public static final dyh c = dyg.i;
   private final Function<dxq, fcr> d;
   private final Map<jn, fcr> e;

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.a).b(c, Boolean.valueOf(true)));
      fcr $$1 = dke.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fco.c(fco.a($$1, dke.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jn.a, $$1).build();
   }

   private Function<dxq, fcr> b(fcr $$0) {
      fcr $$1 = fco.a(dke.b(16.0, 10.0, 16.0), dke.b(8.0, 4.0, 10.0));
      fcr $$2 = fco.a($$1, $$0, fcb.e);
      Map<jn, fcr> $$3 = fco.d(dke.a(4.0, 4.0, 8.0, 0.0, 8.0), new fbx(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fco.a($$2, fco.a($$3.get($$2x.c(b)), fco.b(), fcb.i)), new dyt[]{c});
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public dxq a(dax $$0) {
      jn $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jn.a.b ? jn.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? null : a($$2, duu.s, dvu::a);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvu $$5) {
         $$3.a($$5);
         $$3.a(awk.ad);
      }

      return bsy.a;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dgz $$0, ji $$1, dxq $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.a($$1.c_($$2));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      dus $$4 = $$1.c_($$2);
      if ($$4 instanceof dvu) {
         dvu.a($$1, $$2, $$0, $$3, (dvu)$$4);
      }
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
