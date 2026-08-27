import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class abe implements xd<yx> {
   private final abe.a a;
   private final List<ahd> b;
   private final List<ahd> c;
   private final arq d;

   public abe(abe.a $$0, Collection<ahd> $$1, Collection<ahd> $$2, arq $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public abe(ug $$0) {
      this.a = $$0.b(abe.a.class);
      this.d = arq.a($$0);
      this.b = $$0.a(ug::t);
      if (this.a == abe.a.a) {
         this.c = $$0.a(ug::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, ug::a);
      if (this.a == abe.a.a) {
         $$0.a(this.c, ug::a);
      }
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public List<ahd> a() {
      return this.b;
   }

   public List<ahd> d() {
      return this.c;
   }

   public arq e() {
      return this.d;
   }

   public abe.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
