import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afx implements yv<abk> {
   public static final ym<vz, afx> a = ym.a(yk.h, afx::b, afx.a.b.a(yk.a()), afx::e, afx::new);
   private final int b;
   private final List<afx.a> c;

   public afx(int $$0, Collection<bwk> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bwk $$2 : $$1) {
         this.c.add(new afx.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afx(int $$0, List<afx.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public yx<afx> a() {
      return agd.bg;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afx.a> e() {
      return this.c;
   }

   public static record a(jr<bwj> c, double d, Collection<bwm> e) {
      public static final ym<ByteBuf, bwm> a = ym.a(aku.b, bwm::b, yk.m, bwm::c, bwm.a.e, bwm::d, bwm::new);
      public static final ym<vz, afx.a> b = ym.a(bwj.b, afx.a::a, yk.m, afx.a::b, a.a(yk.a(ArrayList::new)), afx.a::c, afx.a::new);

      public jr<bwj> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bwm> c() {
         return this.e;
      }
   }
}
