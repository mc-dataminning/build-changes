import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cgl extends cgi<bvy> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.i);
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      $$1.ea().a(cfc.i, this.a($$1));
   }

   private List<bvy> a(bvy $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bvy $$0) {
      return $$0.aq() == bvi.bC && $$0.n_();
   }

   private cfe c(bvy $$0) {
      return $$0.ea().c(cfc.h).orElse(cfe.a());
   }
}
