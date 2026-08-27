import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bto extends btl<bjg> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.i);
   }

   @Override
   protected void a(akr $$0, bjg $$1) {
      $$1.dN().a(bsh.i, this.a($$1));
   }

   private List<bjg> a(bjg $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bjg $$0) {
      return $$0.ag() == biu.bf && $$0.m_();
   }

   private bsj c(bjg $$0) {
      return $$0.dN().c(bsh.h).orElse(bsj.a());
   }
}
