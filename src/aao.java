import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aao implements wo<yh> {
   private final aao.a a;
   private final List<agm> b;
   private final List<agm> c;
   private final aqz d;

   public aao(aao.a $$0, Collection<agm> $$1, Collection<agm> $$2, aqz $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public aao(ty $$0) {
      this.a = $$0.b(aao.a.class);
      this.d = aqz.a($$0);
      this.b = $$0.a(ty::t);
      if (this.a == aao.a.a) {
         this.c = $$0.a(ty::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, ty::a);
      if (this.a == aao.a.a) {
         $$0.a(this.c, ty::a);
      }
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public List<agm> a() {
      return this.b;
   }

   public List<agm> d() {
      return this.c;
   }

   public aqz e() {
      return this.d;
   }

   public aao.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
