import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class afd implements yn<aay> {
   public static final ye<vr, afd> a = ye.a(yc.f, afd::b, afd.a.b.a(yc.a()), afd::e, afd::new);
   private final int b;
   private final List<afd.a> c;

   public afd(int $$0, Collection<brr> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (brr $$2 : $$1) {
         this.c.add(new afd.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private afd(int $$0, List<afd.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public yp<afd> a() {
      return afj.bb;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<afd.a> e() {
      return this.c;
   }

   public static record a(il<brq> c, double d, Collection<brt> e) {
      public static final ye<ByteBuf, brt> a = ye.a(
         jf.g, brt::a, yc.i, brt::c, brt.a.e, brt::b, ($$0, $$1, $$2) -> new brt($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final ye<vr, afd.a> b = ye.a(yc.b(ks.c), afd.a::a, yc.i, afd.a::b, a.a(yc.a(ArrayList::new)), afd.a::c, afd.a::new);

      public il<brq> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<brt> c() {
         return this.e;
      }
   }
}
