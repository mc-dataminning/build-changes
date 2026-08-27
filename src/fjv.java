import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fjv {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fjx e;

   public fjv(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fjv b();

   public abstract eyk a(eyk var1, fjz var2);

   public abstract static class a<R extends fjv> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public fjx h() {
         return this.a.e;
      }

      public void a(fjx $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fjv.b c();

      public abstract Either<fjv.c, fjv.b> a(fjz var1);
   }

   public static record b(tl e) {
      public static final fjv.b a = new fjv.b(tl.c("gui.abuseReport.send.no_reason"));
      public static final fjv.b b = new fjv.b(tl.c("gui.chatReport.send.no_reported_messages"));
      public static final fjv.b c = new fjv.b(tl.c("gui.chatReport.send.too_many_messages"));
      public static final fjv.b d = new fjv.b(tl.c("gui.abuseReport.send.comment_too_long"));

      public eua a() {
         return eua.a(this.e);
      }

      public tl b() {
         return this.e;
      }
   }

   public static record c(UUID a, fjy b, AbuseReport c) {
   }
}
