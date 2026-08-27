import com.google.gson.JsonObject;
import java.util.Objects;
import javax.annotation.Nullable;

public class eqr extends eqz {
   public final boolean a;
   public final boolean b;
   public final boolean c;
   public final boolean d;
   public final int e;
   public final boolean f;
   public final boolean g;
   public final int h;
   public final int i;
   private final String o;
   public final String j;
   public final eqk.a k;
   public long l;
   @Nullable
   public String m;
   public boolean n;
   private static final boolean p = false;
   private static final boolean q = true;
   private static final boolean r = true;
   private static final boolean s = true;
   private static final boolean t = true;
   private static final int u = 0;
   private static final boolean v = false;
   private static final int w = 2;
   private static final int x = 0;
   private static final String y = "";
   private static final String z = "";
   private static final eqk.a A = eqk.a.a;
   private static final long B = -1L;
   private static final String C = null;

   public eqr(boolean $$0, boolean $$1, boolean $$2, boolean $$3, int $$4, boolean $$5, int $$6, int $$7, boolean $$8, String $$9, String $$10, eqk.a $$11) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.h = $$6;
      this.i = $$7;
      this.g = $$8;
      this.o = $$9;
      this.j = $$10;
      this.k = $$11;
   }

   public static eqr a() {
      return new eqr(true, true, true, true, 0, false, 2, 0, false, "", "", A);
   }

   public static eqr b() {
      eqr $$0 = a();
      $$0.a(true);
      return $$0;
   }

   public void a(boolean $$0) {
      this.n = $$0;
   }

   public static eqr a(JsonObject $$0) {
      eqr $$1 = new eqr(
         esw.a("pvp", $$0, true),
         esw.a("spawnAnimals", $$0, true),
         esw.a("spawnMonsters", $$0, true),
         esw.a("spawnNPCs", $$0, true),
         esw.a("spawnProtection", $$0, 0),
         esw.a("commandBlocks", $$0, false),
         esw.a("difficulty", $$0, 2),
         esw.a("gameMode", $$0, 0),
         esw.a("forceGameMode", $$0, false),
         esw.a("slotName", $$0, ""),
         esw.a("version", $$0, ""),
         eqk.d(esw.a("compatibility", $$0, eqk.a.a.name()))
      );
      $$1.l = esw.a("worldTemplateId", $$0, -1L);
      $$1.m = esw.b("worldTemplateImage", $$0, C);
      return $$1;
   }

   public String a(int $$0) {
      if (ac.b(this.o)) {
         return this.n ? geu.a("mco.configure.world.slot.empty") : this.b($$0);
      } else {
         return this.o;
      }
   }

   public String b(int $$0) {
      return geu.a("mco.configure.world.slot", $$0);
   }

   public String c() {
      JsonObject $$0 = new JsonObject();
      if (!this.a) {
         $$0.addProperty("pvp", this.a);
      }

      if (!this.b) {
         $$0.addProperty("spawnAnimals", this.b);
      }

      if (!this.c) {
         $$0.addProperty("spawnMonsters", this.c);
      }

      if (!this.d) {
         $$0.addProperty("spawnNPCs", this.d);
      }

      if (this.e != 0) {
         $$0.addProperty("spawnProtection", this.e);
      }

      if (this.f) {
         $$0.addProperty("commandBlocks", this.f);
      }

      if (this.h != 2) {
         $$0.addProperty("difficulty", this.h);
      }

      if (this.i != 0) {
         $$0.addProperty("gameMode", this.i);
      }

      if (this.g) {
         $$0.addProperty("forceGameMode", this.g);
      }

      if (!Objects.equals(this.o, "")) {
         $$0.addProperty("slotName", this.o);
      }

      if (!Objects.equals(this.j, "")) {
         $$0.addProperty("version", this.j);
      }

      if (this.k != A) {
         $$0.addProperty("compatibility", this.k.name());
      }

      return $$0.toString();
   }

   public eqr d() {
      return new eqr(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.g, this.o, this.j, this.k);
   }
}
