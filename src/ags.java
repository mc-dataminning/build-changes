import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ags implements zo<acf> {
   public static final ze<wp, ags> a = ze.a(zc.h, ags::b, ags.a.b.a(zc.a()), ags::e, ags::new);
   private final int b;
   private final List<ags.a> c;

   public ags(int $$0, Collection<bzh> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bzh $$2 : $$1) {
         this.c.add(new ags.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private ags(int $$0, List<ags.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zq<ags> a() {
      return agy.bg;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<ags.a> e() {
      return this.c;
   }

   public static record a(jg<bzg> c, double d, Collection<bzj> e) {
      public static final ze<ByteBuf, bzj> a = ze.a(alr.b, bzj::a, zc.m, bzj::b, bzj.a.e, bzj::c, bzj::new);
      public static final ze<wp, ags.a> b = ze.a(bzg.b, ags.a::a, zc.m, ags.a::b, a.a(zc.a(ArrayList::new)), ags.a::c, ags.a::new);

      public jg<bzg> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bzj> c() {
         return this.e;
      }
   }
}
