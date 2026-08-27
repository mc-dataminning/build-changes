import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class fuh implements fui.a {
   private final eti a;
   private double b = Double.MIN_VALUE;
   private List<eks> c = Collections.emptyList();

   public fuh(eti $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eob $$0, fqz $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bkv $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dN().d($$6, $$6.cH().g(6.0)));
      }

      eof $$7 = $$1.getBuffer(frh.w());

      for (eks $$8 : this.c) {
         fqx.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
