import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aak implements wk<yd> {
   private final aak.a a;
   private final List<agi> b;
   private final List<agi> c;
   private final aqv d;

   public aak(aak.a $$0, Collection<agi> $$1, Collection<agi> $$2, aqv $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public aak(tu $$0) {
      this.a = $$0.b(aak.a.class);
      this.d = aqv.a($$0);
      this.b = $$0.a(tu::t);
      if (this.a == aak.a.a) {
         this.c = $$0.a(tu::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, tu::a);
      if (this.a == aak.a.a) {
         $$0.a(this.c, tu::a);
      }
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public List<agi> a() {
      return this.b;
   }

   public List<agi> d() {
      return this.c;
   }

   public aqv e() {
      return this.d;
   }

   public aak.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
