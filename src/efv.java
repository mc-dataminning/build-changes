import com.mojang.serialization.Codec;

public class efv extends eef<egq> {
   public efv(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jl $$3 : jl.values()) {
            if ($$3 != jl.a && dqu.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dia.ff.m().b(dqu.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
