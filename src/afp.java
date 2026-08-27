import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afp implements yz<abk> {
   public static final yq<wd, afp> a = yq.a(yo.f, afp::b, afp.a.b.a(yo.a()), afp::e, afp::new);
   private final int b;
   private final List<afp.a> c;

   public afp(int $$0, Collection<bsh> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bsh $$2 : $$1) {
         this.c.add(new afp.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afp(int $$0, List<afp.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zb<afp> a() {
      return afv.bb;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afp.a> e() {
      return this.c;
   }

   public static record a(iv<bsg> c, double d, Collection<bsj> e) {
      public static final yq<ByteBuf, bsj> a = yq.a(
         jp.g, bsj::b, yo.i, bsj::d, bsj.a.e, bsj::e, ($$0, $$1, $$2) -> new bsj($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final yq<wd, afp.a> b = yq.a(yo.b(ld.c), afp.a::a, yo.i, afp.a::b, a.a(yo.a(ArrayList::new)), afp.a::c, afp.a::new);

      public iv<bsg> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bsj> c() {
         return this.e;
      }
   }
}
