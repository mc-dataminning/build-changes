import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agn implements zp<ace> {
   public static final zg<wt, agn> a = zg.a(ze.h, agn::b, agn.a.b.a(ze.a()), agn::e, agn::new);
   private final int b;
   private final List<agn.a> c;

   public agn(int $$0, Collection<bwe> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bwe $$2 : $$1) {
         this.c.add(new agn.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agn(int $$0, List<agn.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zr<agn> a() {
      return agt.bc;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agn.a> e() {
      return this.c;
   }

   public static record a(jq<bwd> c, double d, Collection<bwg> e) {
      public static final zg<ByteBuf, bwg> a = zg.a(ali.b, bwg::b, ze.k, bwg::c, bwg.a.e, bwg::d, bwg::new);
      public static final zg<wt, agn.a> b = zg.a(bwd.b, agn.a::a, ze.k, agn.a::b, a.a(ze.a(ArrayList::new)), agn.a::c, agn.a::new);

      public jq<bwd> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bwg> c() {
         return this.e;
      }
   }
}
