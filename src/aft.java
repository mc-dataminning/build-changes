import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aft implements zb<abn> {
   public static final ys<wf, aft> a = ys.a(yq.g, aft::b, aft.a.b.a(yq.a()), aft::e, aft::new);
   private final int b;
   private final List<aft.a> c;

   public aft(int $$0, Collection<buc> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (buc $$2 : $$1) {
         this.c.add(new aft.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private aft(int $$0, List<aft.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zd<aft> a() {
      return afz.bb;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<aft.a> e() {
      return this.c;
   }

   public static record a(jj<bub> c, double d, Collection<bue> e) {
      public static final ys<ByteBuf, bue> a = ys.a(
         kd.g, bue::b, yq.j, bue::d, bue.a.e, bue::e, ($$0, $$1, $$2) -> new bue($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final ys<wf, aft.a> b = ys.a(yq.b(lr.c), aft.a::a, yq.j, aft.a::b, a.a(yq.a(ArrayList::new)), aft.a::c, aft.a::new);

      public jj<bub> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bue> c() {
         return this.e;
      }
   }
}
