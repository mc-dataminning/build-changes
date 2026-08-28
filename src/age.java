import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class age implements zc<abr> {
   public static final yt<wg, age> a = yt.a(yr.h, age::b, age.a.b.a(yr.a()), age::e, age::new);
   private final int b;
   private final List<age.a> c;

   public age(int $$0, Collection<bxt> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bxt $$2 : $$1) {
         this.c.add(new age.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private age(int $$0, List<age.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ze<age> a() {
      return agk.bg;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<age.a> e() {
      return this.c;
   }

   public static record a(js<bxs> c, double d, Collection<bxv> e) {
      public static final yt<ByteBuf, bxv> a = yt.a(ald.b, bxv::b, yr.m, bxv::c, bxv.a.e, bxv::d, bxv::new);
      public static final yt<wg, age.a> b = yt.a(bxs.b, age.a::a, yr.m, age.a::b, a.a(yr.a(ArrayList::new)), age.a::c, age.a::new);

      public js<bxs> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bxv> c() {
         return this.e;
      }
   }
}
