import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ago implements zw<aci> {
   public static final zn<xa, ago> a = zn.a(zl.g, ago::b, ago.a.b.a(zl.a()), ago::e, ago::new);
   private final int b;
   private final List<ago.a> c;

   public ago(int $$0, Collection<buv> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (buv $$2 : $$1) {
         this.c.add(new ago.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private ago(int $$0, List<ago.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zy<ago> a() {
      return agu.bb;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<ago.a> e() {
      return this.c;
   }

   public static record a(ji<buu> c, double d, Collection<bux> e) {
      public static final zn<ByteBuf, bux> a = zn.a(
         kc.g, bux::b, zl.j, bux::d, bux.a.e, bux::e, ($$0, $$1, $$2) -> new bux($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final zn<xa, ago.a> b = zn.a(zl.b(lq.c), ago.a::a, zl.j, ago.a::b, a.a(zl.a(ArrayList::new)), ago.a::c, ago.a::new);

      public ji<buu> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bux> c() {
         return this.e;
      }
   }
}
