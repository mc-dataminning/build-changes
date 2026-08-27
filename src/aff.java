import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aff implements yp<aba> {
   public static final yg<vt, aff> a = yg.a(ye.f, aff::b, aff.a.b.a(ye.a()), aff::e, aff::new);
   private final int b;
   private final List<aff.a> c;

   public aff(int $$0, Collection<brw> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (brw $$2 : $$1) {
         this.c.add(new aff.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private aff(int $$0, List<aff.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public yr<aff> a() {
      return afl.bb;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<aff.a> e() {
      return this.c;
   }

   public static record a(in<brv> c, double d, Collection<bry> e) {
      public static final yg<ByteBuf, bry> a = yg.a(
         jh.g, bry::b, ye.i, bry::d, bry.a.e, bry::e, ($$0, $$1, $$2) -> new bry($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final yg<vt, aff.a> b = yg.a(ye.b(ku.c), aff.a::a, ye.i, aff.a::b, a.a(ye.a(ArrayList::new)), aff.a::c, aff.a::new);

      public in<brv> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bry> c() {
         return this.e;
      }
   }
}
