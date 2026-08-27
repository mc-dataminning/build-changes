import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class eve implements Comparable<eve> {
   private static final Map<String, eve> h = Maps.newHashMap();
   private static final Map<eou.a, eve> i = Maps.newHashMap();
   private static final Set<String> j = Sets.newHashSet();
   public static final String a = "key.categories.movement";
   public static final String b = "key.categories.misc";
   public static final String c = "key.categories.multiplayer";
   public static final String d = "key.categories.gameplay";
   public static final String e = "key.categories.inventory";
   public static final String f = "key.categories.ui";
   public static final String g = "key.categories.creative";
   private static final Map<String, Integer> k = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put("key.categories.movement", 1);
      $$0.put("key.categories.gameplay", 2);
      $$0.put("key.categories.inventory", 3);
      $$0.put("key.categories.creative", 4);
      $$0.put("key.categories.multiplayer", 5);
      $$0.put("key.categories.ui", 6);
      $$0.put("key.categories.misc", 7);
   });
   private final String l;
   private final eou.a m;
   private final String n;
   private eou.a o;
   private boolean p;
   private int q;

   public static void a(eou.a $$0) {
      eve $$1 = i.get($$0);
      if ($$1 != null) {
         $$1.q++;
      }
   }

   public static void a(eou.a $$0, boolean $$1) {
      eve $$2 = i.get($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   public static void a() {
      for (eve $$0 : h.values()) {
         if ($$0.o.a() == eou.b.a && $$0.o.b() != eou.bv.b()) {
            $$0.a(eou.a(evg.O().aM().i(), $$0.o.b()));
         }
      }
   }

   public static void b() {
      for (eve $$0 : h.values()) {
         $$0.n();
      }
   }

   public static void c() {
      for (eve $$0 : h.values()) {
         if ($$0 instanceof evu $$1) {
            $$1.n();
         }
      }
   }

   public static void d() {
      i.clear();

      for (eve $$0 : h.values()) {
         i.put($$0.o, $$0);
      }
   }

   public eve(String $$0, int $$1, String $$2) {
      this($$0, eou.b.a, $$1, $$2);
   }

   public eve(String $$0, eou.b $$1, int $$2, String $$3) {
      this.l = $$0;
      this.o = $$1.a($$2);
      this.m = this.o;
      this.n = $$3;
      h.put($$0, this);
      i.put(this.o, this);
      j.add($$3);
   }

   public boolean e() {
      return this.p;
   }

   public String f() {
      return this.n;
   }

   public boolean g() {
      if (this.q == 0) {
         return false;
      } else {
         this.q--;
         return true;
      }
   }

   private void n() {
      this.q = 0;
      this.a(false);
   }

   public String h() {
      return this.l;
   }

   public eou.a i() {
      return this.m;
   }

   public void b(eou.a $$0) {
      this.o = $$0;
   }

   public int a(eve $$0) {
      return this.n.equals($$0.n) ? gfq.a(this.l).compareTo(gfq.a($$0.l)) : k.get(this.n).compareTo(k.get($$0.n));
   }

   public static Supplier<vf> a(String $$0) {
      eve $$1 = h.get($$0);
      return $$1 == null ? () -> vf.c($$0) : $$1::k;
   }

   public boolean b(eve $$0) {
      return this.o.equals($$0.o);
   }

   public boolean j() {
      return this.o.equals(eou.bv);
   }

   public boolean a(int $$0, int $$1) {
      return $$0 == eou.bv.b() ? this.o.a() == eou.b.b && this.o.b() == $$1 : this.o.a() == eou.b.a && this.o.b() == $$0;
   }

   public boolean a(int $$0) {
      return this.o.a() == eou.b.c && this.o.b() == $$0;
   }

   public vf k() {
      return this.o.d();
   }

   public boolean l() {
      return this.o.equals(this.m);
   }

   public String m() {
      return this.o.c();
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }
}
