import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fjr {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fjt e;

   public fjr(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fjr b();

   public abstract eye a(eye var1, fjv var2);

   public abstract static class a<R extends fjr> {
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
      public fjt h() {
         return this.a.e;
      }

      public void a(fjt $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fjr.b c();

      public abstract Either<fjr.c, fjr.b> a(fjv var1);
   }

   public static record b(tl e) {
      public static final fjr.b a = new fjr.b(tl.c("gui.abuseReport.send.no_reason"));
      public static final fjr.b b = new fjr.b(tl.c("gui.chatReport.send.no_reported_messages"));
      public static final fjr.b c = new fjr.b(tl.c("gui.chatReport.send.too_many_messages"));
      public static final fjr.b d = new fjr.b(tl.c("gui.abuseReport.send.comment_too_long"));

      public etv a() {
         return etv.a(this.e);
      }

      public tl b() {
         return this.e;
      }
   }

   public static record c(UUID a, fju b, AbuseReport c) {
   }
}
