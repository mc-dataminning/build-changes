import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afx implements yw<abl> {
   public static final yn<wa, afx> a = yn.a(yl.h, afx::b, afx.a.b.a(yl.a()), afx::e, afx::new);
   private final int b;
   private final List<afx.a> c;

   public afx(int $$0, Collection<bxc> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bxc $$2 : $$1) {
         this.c.add(new afx.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afx(int $$0, List<afx.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public yy<afx> a() {
      return agd.bf;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afx.a> e() {
      return this.c;
   }

   public static record a(jr<bxb> c, double d, Collection<bxe> e) {
      public static final yn<ByteBuf, bxe> a = yn.a(aku.b, bxe::b, yl.m, bxe::c, bxe.a.e, bxe::d, bxe::new);
      public static final yn<wa, afx.a> b = yn.a(bxb.b, afx.a::a, yl.m, afx.a::b, a.a(yl.a(ArrayList::new)), afx.a::c, afx.a::new);

      public jr<bxb> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bxe> c() {
         return this.e;
      }
   }
}
