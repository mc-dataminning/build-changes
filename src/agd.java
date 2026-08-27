import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agd implements zl<abw> {
   public static final zc<wp, agd> a = zc.a(za.g, agd::b, agd.a.b.a(za.a()), agd::e, agd::new);
   private final int b;
   private final List<agd.a> c;

   public agd(int $$0, Collection<btr> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (btr $$2 : $$1) {
         this.c.add(new agd.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agd(int $$0, List<agd.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zn<agd> a() {
      return agj.bd;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agd.a> e() {
      return this.c;
   }

   public static record a(ja<btq> c, double d, Collection<btt> e) {
      public static final zc<ByteBuf, btt> a = zc.a(
         ju.g, btt::b, za.j, btt::d, btt.a.e, btt::e, ($$0, $$1, $$2) -> new btt($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final zc<wp, agd.a> b = zc.a(za.b(li.c), agd.a::a, za.j, agd.a::b, a.a(za.a(ArrayList::new)), agd.a::c, agd.a::new);

      public ja<btq> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<btt> c() {
         return this.e;
      }
   }
}
