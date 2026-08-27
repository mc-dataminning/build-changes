import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class efw extends egd {
   public final aut<czf> a;
   public static final Codec<efw> b = aut.b(ki.f).xmap(efw::new, $$0 -> $$0.a);

   public efw(aut<czf> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      return duu.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected egf<?> a() {
      return egf.n;
   }
}
