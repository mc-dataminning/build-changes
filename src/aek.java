import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aek implements xx<aag> {
   public static final xo<vb, aek> a = xo.a(xm.d, aek::b, aek.a.b.a(xm.a()), aek::e, aek::new);
   private final int b;
   private final List<aek.a> c;

   public aek(int $$0, Collection<bph> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bph $$2 : $$1) {
         this.c.add(new aek.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private aek(int $$0, List<aek.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public xz<aek> a() {
      return aeq.ba;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<aek.a> e() {
      return this.c;
   }

   public static record a(ij<bpg> c, double d, Collection<bpj> e) {
      public static final xo<ByteBuf, bpj> a = xo.a(
         jc.f, bpj::a, xm.g, bpj::c, bpj.a.e, bpj::b, ($$0, $$1, $$2) -> new bpj($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final xo<vb, aek.a> b = xo.a(xm.b(kg.c), aek.a::a, xm.g, aek.a::b, a.a(xm.a(ArrayList::new)), aek.a::c, aek.a::new);

      public ij<bpg> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bpj> c() {
         return this.e;
      }
   }
}
