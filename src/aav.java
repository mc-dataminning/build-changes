import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aav implements wu<yo> {
   private final aav.a a;
   private final List<agt> b;
   private final List<agt> c;
   private final arg d;

   public aav(aav.a $$0, Collection<agt> $$1, Collection<agt> $$2, arg $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public aav(ue $$0) {
      this.a = $$0.b(aav.a.class);
      this.d = arg.a($$0);
      this.b = $$0.a(ue::t);
      if (this.a == aav.a.a) {
         this.c = $$0.a(ue::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, ue::a);
      if (this.a == aav.a.a) {
         $$0.a(this.c, ue::a);
      }
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public List<agt> a() {
      return this.b;
   }

   public List<agt> d() {
      return this.c;
   }

   public arg e() {
      return this.d;
   }

   public aav.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
