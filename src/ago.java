import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ago implements zq<acf> {
   public static final zh<wu, ago> a = zh.a(zf.h, ago::b, ago.a.b.a(zf.a()), ago::e, ago::new);
   private final int b;
   private final List<ago.a> c;

   public ago(int $$0, Collection<bwl> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bwl $$2 : $$1) {
         this.c.add(new ago.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private ago(int $$0, List<ago.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zs<ago> a() {
      return agu.bc;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<ago.a> e() {
      return this.c;
   }

   public static record a(jq<bwk> c, double d, Collection<bwn> e) {
      public static final zh<ByteBuf, bwn> a = zh.a(alj.b, bwn::b, zf.l, bwn::c, bwn.a.e, bwn::d, bwn::new);
      public static final zh<wu, ago.a> b = zh.a(bwk.b, ago.a::a, zf.l, ago.a::b, a.a(zf.a(ArrayList::new)), ago.a::c, ago.a::new);

      public jq<bwk> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bwn> c() {
         return this.e;
      }
   }
}
